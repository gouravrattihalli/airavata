#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
import apache.airavata.model.commons.ttypes
import apache.airavata.model.status.ttypes
import apache.airavata.model.appcatalog.computeresource.ttypes


from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None


class TaskTypes:
  """
  TaskTypes: An enumerated list of TaskTypes. Task being generic, the task type will provide the concrete interpretation.

  """
  ENV_SETUP = 0
  DATA_STAGING = 1
  JOB_SUBMISSION = 2
  ENV_CLEANUP = 3
  MONITORING = 4

  _VALUES_TO_NAMES = {
    0: "ENV_SETUP",
    1: "DATA_STAGING",
    2: "JOB_SUBMISSION",
    3: "ENV_CLEANUP",
    4: "MONITORING",
  }

  _NAMES_TO_VALUES = {
    "ENV_SETUP": 0,
    "DATA_STAGING": 1,
    "JOB_SUBMISSION": 2,
    "ENV_CLEANUP": 3,
    "MONITORING": 4,
  }

class DataStageType:
  """
  DataStagingTaskModel: A structure holding the data staging task details.

  Source and Destination locations includes standard representation of protocol, host, port and path
    A friendly description of the task, usally used to communicate information to users.

  """
  INPUT = 0
  OUPUT = 1

  _VALUES_TO_NAMES = {
    0: "INPUT",
    1: "OUPUT",
  }

  _NAMES_TO_VALUES = {
    "INPUT": 0,
    "OUPUT": 1,
  }


class TaskModel:
  """
  TaskModel: A structure holding the generic task details.

  taskDetail:
    A friendly description of the task, usally used to communicate information to users.

  subTaskModel:
    A generic byte object for the Task developer to store internal serialized data into registry catalogs.

  Attributes:
   - taskId
   - taskType
   - parentProcessId
   - creationTime
   - lastUpdateTime
   - taskStatus
   - taskDetail
   - subTaskModel
   - taskError
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'taskId', None, "DO_NOT_SET_AT_CLIENTS", ), # 1
    (2, TType.I32, 'taskType', None, None, ), # 2
    (3, TType.STRING, 'parentProcessId', None, None, ), # 3
    (4, TType.I64, 'creationTime', None, None, ), # 4
    (5, TType.I64, 'lastUpdateTime', None, None, ), # 5
    (6, TType.STRUCT, 'taskStatus', (apache.airavata.model.status.ttypes.TaskStatus, apache.airavata.model.status.ttypes.TaskStatus.thrift_spec), None, ), # 6
    (7, TType.STRING, 'taskDetail', None, None, ), # 7
    (8, TType.STRING, 'subTaskModel', None, None, ), # 8
    (9, TType.STRUCT, 'taskError', (apache.airavata.model.commons.ttypes.ErrorModel, apache.airavata.model.commons.ttypes.ErrorModel.thrift_spec), None, ), # 9
  )

  def __init__(self, taskId=thrift_spec[1][4], taskType=None, parentProcessId=None, creationTime=None, lastUpdateTime=None, taskStatus=None, taskDetail=None, subTaskModel=None, taskError=None,):
    self.taskId = taskId
    self.taskType = taskType
    self.parentProcessId = parentProcessId
    self.creationTime = creationTime
    self.lastUpdateTime = lastUpdateTime
    self.taskStatus = taskStatus
    self.taskDetail = taskDetail
    self.subTaskModel = subTaskModel
    self.taskError = taskError

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.taskId = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.taskType = iprot.readI32();
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRING:
          self.parentProcessId = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.creationTime = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I64:
          self.lastUpdateTime = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.STRUCT:
          self.taskStatus = apache.airavata.model.status.ttypes.TaskStatus()
          self.taskStatus.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.STRING:
          self.taskDetail = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.STRING:
          self.subTaskModel = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.STRUCT:
          self.taskError = apache.airavata.model.commons.ttypes.ErrorModel()
          self.taskError.read(iprot)
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('TaskModel')
    if self.taskId is not None:
      oprot.writeFieldBegin('taskId', TType.STRING, 1)
      oprot.writeString(self.taskId)
      oprot.writeFieldEnd()
    if self.taskType is not None:
      oprot.writeFieldBegin('taskType', TType.I32, 2)
      oprot.writeI32(self.taskType)
      oprot.writeFieldEnd()
    if self.parentProcessId is not None:
      oprot.writeFieldBegin('parentProcessId', TType.STRING, 3)
      oprot.writeString(self.parentProcessId)
      oprot.writeFieldEnd()
    if self.creationTime is not None:
      oprot.writeFieldBegin('creationTime', TType.I64, 4)
      oprot.writeI64(self.creationTime)
      oprot.writeFieldEnd()
    if self.lastUpdateTime is not None:
      oprot.writeFieldBegin('lastUpdateTime', TType.I64, 5)
      oprot.writeI64(self.lastUpdateTime)
      oprot.writeFieldEnd()
    if self.taskStatus is not None:
      oprot.writeFieldBegin('taskStatus', TType.STRUCT, 6)
      self.taskStatus.write(oprot)
      oprot.writeFieldEnd()
    if self.taskDetail is not None:
      oprot.writeFieldBegin('taskDetail', TType.STRING, 7)
      oprot.writeString(self.taskDetail)
      oprot.writeFieldEnd()
    if self.subTaskModel is not None:
      oprot.writeFieldBegin('subTaskModel', TType.STRING, 8)
      oprot.writeString(self.subTaskModel)
      oprot.writeFieldEnd()
    if self.taskError is not None:
      oprot.writeFieldBegin('taskError', TType.STRUCT, 9)
      self.taskError.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.taskId is None:
      raise TProtocol.TProtocolException(message='Required field taskId is unset!')
    if self.taskType is None:
      raise TProtocol.TProtocolException(message='Required field taskType is unset!')
    if self.parentProcessId is None:
      raise TProtocol.TProtocolException(message='Required field parentProcessId is unset!')
    if self.creationTime is None:
      raise TProtocol.TProtocolException(message='Required field creationTime is unset!')
    if self.lastUpdateTime is None:
      raise TProtocol.TProtocolException(message='Required field lastUpdateTime is unset!')
    if self.taskStatus is None:
      raise TProtocol.TProtocolException(message='Required field taskStatus is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.taskId)
    value = (value * 31) ^ hash(self.taskType)
    value = (value * 31) ^ hash(self.parentProcessId)
    value = (value * 31) ^ hash(self.creationTime)
    value = (value * 31) ^ hash(self.lastUpdateTime)
    value = (value * 31) ^ hash(self.taskStatus)
    value = (value * 31) ^ hash(self.taskDetail)
    value = (value * 31) ^ hash(self.subTaskModel)
    value = (value * 31) ^ hash(self.taskError)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class DataStagingTaskModel:
  """
  Attributes:
   - source
   - destination
   - type
   - transferStartTime
   - transferEndTime
   - transferRate
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'source', None, None, ), # 1
    (2, TType.STRING, 'destination', None, None, ), # 2
    (3, TType.I32, 'type', None, None, ), # 3
    (4, TType.I64, 'transferStartTime', None, None, ), # 4
    (5, TType.I64, 'transferEndTime', None, None, ), # 5
    (6, TType.STRING, 'transferRate', None, None, ), # 6
  )

  def __init__(self, source=None, destination=None, type=None, transferStartTime=None, transferEndTime=None, transferRate=None,):
    self.source = source
    self.destination = destination
    self.type = type
    self.transferStartTime = transferStartTime
    self.transferEndTime = transferEndTime
    self.transferRate = transferRate

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.source = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.destination = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I32:
          self.type = iprot.readI32();
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.transferStartTime = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.I64:
          self.transferEndTime = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.STRING:
          self.transferRate = iprot.readString();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('DataStagingTaskModel')
    if self.source is not None:
      oprot.writeFieldBegin('source', TType.STRING, 1)
      oprot.writeString(self.source)
      oprot.writeFieldEnd()
    if self.destination is not None:
      oprot.writeFieldBegin('destination', TType.STRING, 2)
      oprot.writeString(self.destination)
      oprot.writeFieldEnd()
    if self.type is not None:
      oprot.writeFieldBegin('type', TType.I32, 3)
      oprot.writeI32(self.type)
      oprot.writeFieldEnd()
    if self.transferStartTime is not None:
      oprot.writeFieldBegin('transferStartTime', TType.I64, 4)
      oprot.writeI64(self.transferStartTime)
      oprot.writeFieldEnd()
    if self.transferEndTime is not None:
      oprot.writeFieldBegin('transferEndTime', TType.I64, 5)
      oprot.writeI64(self.transferEndTime)
      oprot.writeFieldEnd()
    if self.transferRate is not None:
      oprot.writeFieldBegin('transferRate', TType.STRING, 6)
      oprot.writeString(self.transferRate)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.source is None:
      raise TProtocol.TProtocolException(message='Required field source is unset!')
    if self.destination is None:
      raise TProtocol.TProtocolException(message='Required field destination is unset!')
    if self.type is None:
      raise TProtocol.TProtocolException(message='Required field type is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.source)
    value = (value * 31) ^ hash(self.destination)
    value = (value * 31) ^ hash(self.type)
    value = (value * 31) ^ hash(self.transferStartTime)
    value = (value * 31) ^ hash(self.transferEndTime)
    value = (value * 31) ^ hash(self.transferRate)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class EnvironmentSetupTaskModel:
  """
  EnvironmentSetupTaskModel: A structure holding the environment creation task details


  Attributes:
   - location
   - protocol
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'location', None, None, ), # 1
    (2, TType.I32, 'protocol', None, None, ), # 2
  )

  def __init__(self, location=None, protocol=None,):
    self.location = location
    self.protocol = protocol

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRING:
          self.location = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.protocol = iprot.readI32();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('EnvironmentSetupTaskModel')
    if self.location is not None:
      oprot.writeFieldBegin('location', TType.STRING, 1)
      oprot.writeString(self.location)
      oprot.writeFieldEnd()
    if self.protocol is not None:
      oprot.writeFieldBegin('protocol', TType.I32, 2)
      oprot.writeI32(self.protocol)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.location is None:
      raise TProtocol.TProtocolException(message='Required field location is unset!')
    if self.protocol is None:
      raise TProtocol.TProtocolException(message='Required field protocol is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.location)
    value = (value * 31) ^ hash(self.protocol)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class JobSubmissionTaskModel:
  """
  Attributes:
   - jobSubmissionProtocol
   - monitorMode
  """

  thrift_spec = (
    None, # 0
    (1, TType.I32, 'jobSubmissionProtocol', None, None, ), # 1
    (2, TType.I32, 'monitorMode', None, None, ), # 2
  )

  def __init__(self, jobSubmissionProtocol=None, monitorMode=None,):
    self.jobSubmissionProtocol = jobSubmissionProtocol
    self.monitorMode = monitorMode

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I32:
          self.jobSubmissionProtocol = iprot.readI32();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.monitorMode = iprot.readI32();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('JobSubmissionTaskModel')
    if self.jobSubmissionProtocol is not None:
      oprot.writeFieldBegin('jobSubmissionProtocol', TType.I32, 1)
      oprot.writeI32(self.jobSubmissionProtocol)
      oprot.writeFieldEnd()
    if self.monitorMode is not None:
      oprot.writeFieldBegin('monitorMode', TType.I32, 2)
      oprot.writeI32(self.monitorMode)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.jobSubmissionProtocol is None:
      raise TProtocol.TProtocolException(message='Required field jobSubmissionProtocol is unset!')
    if self.monitorMode is None:
      raise TProtocol.TProtocolException(message='Required field monitorMode is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.jobSubmissionProtocol)
    value = (value * 31) ^ hash(self.monitorMode)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class MonitorTaskModel:
  """
  Attributes:
   - monitorMode
  """

  thrift_spec = (
    None, # 0
    (1, TType.I32, 'monitorMode', None, None, ), # 1
  )

  def __init__(self, monitorMode=None,):
    self.monitorMode = monitorMode

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I32:
          self.monitorMode = iprot.readI32();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('MonitorTaskModel')
    if self.monitorMode is not None:
      oprot.writeFieldBegin('monitorMode', TType.I32, 1)
      oprot.writeI32(self.monitorMode)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.monitorMode is None:
      raise TProtocol.TProtocolException(message='Required field monitorMode is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.monitorMode)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)